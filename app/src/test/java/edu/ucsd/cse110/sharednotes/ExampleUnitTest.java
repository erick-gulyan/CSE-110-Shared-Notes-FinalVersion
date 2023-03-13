package edu.ucsd.cse110.sharednotes;

import org.junit.Test;

import static org.junit.Assert.*;

import edu.ucsd.cse110.sharednotes.model.Note;
import edu.ucsd.cse110.sharednotes.model.NoteAPI;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testNoteAPIGet() {
        NoteAPI noteAPI = new NoteAPI();

        noteAPI.getNote("Josh test note");

        assertEquals(1, 1);
    }

    @Test
    public void testNoteAPIPut() {
        NoteAPI noteAPI = new NoteAPI();
        Note note = new Note("www josh test", "ljdasf daf djasfl dsdaf", 1);

        noteAPI.putNote(note);

        assertEquals(1,1);
    }

}