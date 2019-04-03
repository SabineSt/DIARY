package com.seleni.Diary.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    public List<Entry> getAllEntries() {
        return entryRepository.getAllEntries();
    }

    public List<Entry> getEntriesByWords(String letters) {
        return entryRepository.getEntriesByWords(letters);
    }

    public List<Entry> getEntriesByMonth(String month) {
        return entryRepository.getEntriesByMonth(month);
    }

    public List<Entry> getEntryByDate(Date date) {
        return entryRepository.getEntryByDate(date);
    }

    public Entry createEntry(Entry inputEntry) {
        return entryRepository.createEntry(inputEntry);
    }


    public List<Entry> getAllBackgroundImges() {
        return entryRepository.getAllBackgroundImges();
    }

    public List<Entry> getBackgroundImgByChoice(int choice) {
        return entryRepository.getBackgroundImgByChoice(choice);
    }

    public List<Entry> getAllIcons() {
        return entryRepository.getAllIcons();
    }

    public List<Entry> getIconByChoice(int choice2) {
        return entryRepository.getIconByChoice(choice2);
    }

}


/*
public List<Entry> getAllEntries() {
        List<Entry> entries = new ArrayList<>();
        Entry entry = new Entry();
        entry.setThoughtsOfTDay("Oh my!");
        entry.setLocation("Vienna");
        entries.add(entry);
        return entries;
        }*/
