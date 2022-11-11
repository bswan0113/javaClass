package day15;


public class Word {

	private String word;
	private String mean;

	public Word(String Word, String mean) {
		this.mean=mean;
		this.word=Word;
	}

	@Override
	public String toString() {
		return " "+word + " : " +mean;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
		{ if(!(obj instanceof String)){return false;}
		return word.equals(obj);}
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	
	
}

	public void setMean(String mean2) {
		this.mean=mean2;
		System.out.println(this.word +" : "+ this.mean + "\n수정완료 굳 ㅎ");
		
	}
}