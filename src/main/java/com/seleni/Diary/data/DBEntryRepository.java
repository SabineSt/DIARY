package com.seleni.Diary.data;

import com.seleni.Diary.logic.Entry;
import com.seleni.Diary.logic.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DBEntryRepository implements EntryRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


    @Override
    public List<Entry> getAllEntries() {
        String query = "SELECT * from ENTRIES";
       /* String query = "SELECT * from (((ENTRIES inner join ICONS on entries.iconID = icons.ID) inner join " +
                "BACKGROUNDIMGES on entries.backgroundImgID = backgroundimges.ID) inner join FOTOS on fotos.entryID = entries.ID);";*/
        return jdbcTemplate.query(query, new EntryRowMapper());

    }

    @Override
    public List<Entry> getEntriesByWords(String letters) {
        String query = "SELECT * from entries where toughtsOfTDay like :letters AND specialWords like :letters";
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("letters", "%" + letters + "%");
        return jdbcTemplate.query(query, sqlParameterSource, new EntryRowMapper());
    }


    @Override
    public List<Entry> getEntriesByMonth(String month) {
        String query = "SELECT * from entries where date like :month";
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("month", "month");
        return jdbcTemplate.query(query, sqlParameterSource, new EntryRowMapper());
    }
    //word or int??

    @Override
    public List<Entry> getEntryByDate(Date date) {
        String query = "SELECT * from Entries where date = :date";
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("date", "date");
        return jdbcTemplate.query(query, sqlParameterSource, new EntryRowMapper());
    }

    //vll nur teile

    @Override
    public Entry createEntry(Entry inputEntry) {
        String query = "INSERT into ENTRIES (date, thoughtsOfTDay, specialWords, favouriteSong, location) VALUES" +
                "(:date, :thoughtsOfTDay, :specialWords, :favouriteSong, :location);";
        //"INSERT into FOTOS(foto) VALUES(:foto);";
        //retrieve ID of choosen icon & backgroundImg set
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("date", inputEntry.getDate());
        sqlParameterSource.addValue("thoughtsOfTDay", inputEntry.getThoughtsOfTDay());
        sqlParameterSource.addValue("specialWords", inputEntry.getSpecialWords());
        sqlParameterSource.addValue("favouriteSong", inputEntry.getFavouriteSong());
        sqlParameterSource.addValue("location", inputEntry.getLocation());
        // sqlParameterSource.addValue("foto", inputEntry.getFoto());
        jdbcTemplate.update(query, sqlParameterSource);
        return inputEntry;

        //sqlParameterSource.addValue("iconName", inputEntry.get/set?IconID());
        //sqlParameterSource.addValue("iconImg", inputEntry.getIconImg());
    }


    @Override
    public List<Entry> getAllBackgroundImges() {
        String query = "SELECT name, image from backgroundImges";
        return jdbcTemplate.query(query, new EntryRowMapper());
    }

    @Override
    public List<Entry> getBackgroundImgByChoice(int choice) {
        String query = "SELECT name, image from backgroundImges where ID = :choice";
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("choice", "choice");
        // Entry entry = new Entry();
        // entry.setBackgroundImg(rs.getB);
        return jdbcTemplate.query(query, sqlParameterSource, new EntryRowMapper());
    }

    @Override
    public List<Entry> getAllIcons() {
        String query = "SELECT name, image from icons";
        return jdbcTemplate.query(query, new EntryRowMapper());
    }

    @Override
    public List<Entry> getIconByChoice(int choice2) {
        String query = "SELECT name, image from icons where ID = :choice2";
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("choice2", "choice2");
        // Entry entry = new Entry();
        // entry.setBackgroundImg(rs.getB);
        return jdbcTemplate.query(query, sqlParameterSource, new EntryRowMapper());
    }


    private static class EntryRowMapper implements RowMapper<Entry> {

        @Override
        public Entry mapRow(ResultSet rs, int rowNum) throws SQLException {

            Entry entry = new Entry();
            entry.setDate(rs.getDate("date"));
            entry.setThoughtsOfTDay(rs.getString("thoughtsOfTDay"));
            entry.setSpecialWords(rs.getString("specialWords"));
            // entry.setFoto(rs.getByte("foto"));
            // entry.setIconName(rs.getString("iconName"));
            // entry.setIconImg(rs.getByte("icon"));
            //entry.setBackgroundImgName(rs.getString("backgroundImgName"));
            //entry.setBackgroundImg(rs.getByte("backgroundImg"));
            entry.setFavouriteSong(rs.getString("favouriteSong"));
            entry.setLocation(rs.getString("location"));
            return entry;
//entry.setUserName(rs.getString("userName"));
        }
    }
}