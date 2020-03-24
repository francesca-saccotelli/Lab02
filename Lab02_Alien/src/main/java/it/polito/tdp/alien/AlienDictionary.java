package it.polito.tdp.alien;
import java.util.*;

public class AlienDictionary {

	//List<Word>dizionario=new LinkedList<Word>();
	List<WordEnhanced>dizionario=new LinkedList<WordEnhanced>();
	
	public void addWord(String alienWord,String translation) {
		/*Word w2=new Word(alienWord,translation);
		for(Word w:dizionario) {
			if(w.equals(w2)) {
				w.setTranslation(translation);
			}
		}
		this.dizionario.add(w2);*/
		WordEnhanced w2=new WordEnhanced(alienWord,translation);
		for(WordEnhanced w:dizionario) {
			if(w.equals(w2)) {
				w.setTraduzioni(translation);
			}
		}
		this.dizionario.add(w2);
		w2.setTraduzioni(translation);
	}
	
	public List<String> translateWord(String alienWord) {
		/*for(Word w:dizionario) {
			if(w.getAlienWord().compareTo(alienWord)==0) {
				return w.getTranslation();
			}
		}
		return null;*/
		for(WordEnhanced w:dizionario) {
			if(w.getAlienWord().compareTo(alienWord)==0) {
				return w.getTraduzioni();
			}
		}
		return null;
	}
	public boolean isCorrect(String parola) {
		boolean isCorrect=false;
		for(int i=0; i<parola.length();i++) {
			if(Character.isAlphabetic(parola.charAt(i))==true) {
				isCorrect=true;
			}else
				isCorrect=false;
		}
		return isCorrect;
	}
}
