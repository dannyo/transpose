package com.transpose;


public class ChordTransposer {

	private static String[] key = new String[]{"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "Bb", "B"};

	public String transposeChord(String chord, int stepCount){
		
		String transposedChord = "";
		if(chord.contains("/")){
			String[] splitChords = chord.split("/");
			transposedChord = transposeChord(splitChords[0],stepCount) + "/" + transposeChord(splitChords[1], stepCount);
			return transposedChord;
		}
		
		int index = java.util.Arrays.asList(key).indexOf(chord);
		
		int newIndex = index + stepCount;
		if (newIndex>11){
			newIndex = newIndex-12;
		}else if (newIndex < 0){
			newIndex = newIndex+12;
		}
		transposedChord = key[newIndex];
		return transposedChord;
	}
	
	
	
}
