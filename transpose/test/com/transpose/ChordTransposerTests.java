package com.transpose;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChordTransposerTests {
	private ChordTransposer chordTransposer;
	
	@Before
	public void setUp(){
		this.chordTransposer = new ChordTransposer();
	}
	
	@After
	public void tearDown(){
		chordTransposer = null;
	}
	
	@Test
	public void shouldTransposeChordHalfStepUp(){
		String chord = "F";
		String newChord = chordTransposer.transposeChord(chord, 1);
		assertEquals("F#", newChord);
	}
	
	@Test
	public void shouldTransposeChordFullStepUp(){
		String chord = "A";
		String newChord = chordTransposer.transposeChord(chord, 2);
		assertEquals("B", newChord);
	}
	
	@Test
	public void shouldTransposeChordHalfStepDown(){
		String chord = "F#";
		String newChord = chordTransposer.transposeChord(chord, -1);
		assertEquals("F", newChord);
	}
	
	@Test
	public void shouldTransposeChordFullStepDown(){
		String chord = "B";
		String newChord = chordTransposer.transposeChord(chord, -2);
		assertEquals("A", newChord);
	}
	
	@Test
	public void shouldTransposeChordFromBUpToC(){
		String chord = "B";
		String newChord = chordTransposer.transposeChord(chord, 1);
		assertEquals("C", newChord);
	}
		
	@Test
	public void shouldTransposeChordFromBDownToC(){
		String chord = "C";
		String newChord = chordTransposer.transposeChord(chord, -1);
		assertEquals("B", newChord);
	}
	
	@Test
	public void shouldTransposeChordUpWithBassNote(){
		String chord = "D/F#";
		String newChord = chordTransposer.transposeChord(chord, 2);
		assertEquals("E/G#", newChord);		
	}
	
	@Test
	public void shouldTransposeChordDownWithBassNote(){
		String chord = "E/G#";
		String newChord = chordTransposer.transposeChord(chord, -2);
		assertEquals("D/F#", newChord);		
	}
	
	@Test
	public void shouldTransposeMinors(){
		String chord = "Am";
		String newChord = chordTransposer.transposeChord(chord, 2);
		assertEquals("Bm", newChord);	
	}
	
	@Test
	public void shouldTransposeMinorsWithBassNote(){
		String chord = "Am/G";
		String newChord = chordTransposer.transposeChord(chord, 2);
		assertEquals("Bm/A", newChord);	
	}
	
	@Test
	public void shouldTranspose7thChords(){
		String chord = "Am7";
		String newChord = chordTransposer.transposeChord(chord, 2);
		assertEquals("Bm7", newChord);	
	}
	
	@Test
	public void shouldTransposeSuspendedChords(){
		String chord = "Asus";
		String newChord = chordTransposer.transposeChord(chord, 2);
		assertEquals("Bsus", newChord);	
	}
	
	@Test
	public void shouldTransposeSuspendedChordsWithBassNote(){
		String chord = "Dsus/G";
		String newChord = chordTransposer.transposeChord(chord, 2);
		assertEquals("Esus/A", newChord);	
	}
}
