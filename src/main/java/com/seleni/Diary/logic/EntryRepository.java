package com.seleni.Diary.logic;

import java.sql.Date;
import java.util.List;

public interface EntryRepository {


    List<Entry> getAllEntries();

    List<Entry> getEntriesByWords(String letters);

    List<Entry> getEntriesByMonth(String month);

    List <Entry> getEntryByDate(Date date);

    Entry createEntry(Entry inputEntry);



    List<Entry> getAllBackgroundImges();

    List <Entry> getBackgroundImgByChoice(int choice);

    List<Entry> getAllIcons();

    List <Entry> getIconByChoice(int choice2);

}

// iconforapi weather  automatic
//  backgroundfordaytime  automatic