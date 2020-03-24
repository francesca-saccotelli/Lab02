package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {

	private String alienWord;
	private String translation;
	private List<String> traduzioni;
	
	public WordEnhanced(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
		this.traduzioni=new LinkedList<String>();
	}
	
	public WordEnhanced(WordEnhanced w) {
		this.alienWord=w.alienWord;
		this.translation=w.translation;
	}
	
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	public List<String> getTraduzioni() {
		return traduzioni;
	}

	public void setTraduzioni(String traduzione) {
		this.traduzioni.add(traduzione);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordEnhanced other = (WordEnhanced) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
    
	
}
