package com.transpose;


public class ChordTransposer {

	private static String[] key = new String[]{"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "Bb", "B"};

	public String transposeChord(String chord, int stepCount){
		
		String transposedChord = "";
		if(chord.contains("/")){
			String[] splitChords = chord.split("/");
			return transposeChord(splitChords[0],stepCount) + "/" + transposeChord(splitChords[1], stepCount);
		}
		

		if(chord.contains("9")){
			return transposeChord(chord.replace("9", ""),stepCount) + "9";
		}
		if(chord.contains("7")){
			return transposeChord(chord.replace("7", ""),stepCount) + "7";
		}
		if(chord.contains("4")){
			return transposeChord(chord.replace("4", ""),stepCount) + "4";
		}
		if(chord.contains("sus")){
			return transposeChord(chord.replace("sus", ""),stepCount) + "sus";
		}
		if(chord.contains("maj")){
			return transposeChord(chord.replace("maj", ""),stepCount) + "maj";
		}
		if(chord.contains("6")){
			return transposeChord(chord.replace("6", ""),stepCount) + "6 ";
		}
		if(chord.contains("2")){
			return transposeChord(chord.replace("2", ""),stepCount) + "2";
		}
		if(chord.contains("m")){
			return transposeChord(chord.replace("m", ""),stepCount) + "m";
		}
		if(chord.contains("b")){
			return transposeChord(chord.replace("b", ""),stepCount) + "b";
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
