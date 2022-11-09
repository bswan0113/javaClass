package day13;

import lombok.Data;

@Data
public class Score {
	//필드 : 과목, 학기, 중간, 기말, 수행평가, 총점
	private String title;
	private int term, midScore, finalScore, performance;
	private double total;
	private double midRate=0.4, finalRate=0.5, performanceRate=0.1;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public int getMidScore() {
		return midScore;
	}
	public void setMidScore(int midScore) {
		this.midScore = midScore;
	}
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	public int getPerformance() {
		return performance;
	}
	public void setPerformance(int performance) {
		this.performance = performance;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Score [title=" + title + ", term=" + term + ", midScore=" + midScore + ", finalScore=" + finalScore
				+ ", performance=" + performance +"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + term;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Score other = (Score) obj;
		if (term != other.term)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public Score(String title, int term, int midScore, int finalScore, int performance) {
		super();
		this.title = title;
		this.term = term;
		this.midScore = midScore;
		this.finalScore = finalScore;
		this.performance = performance;
		this.total=midRate*midScore +finalScore*finalRate + performance*performanceRate;

	}
	
	public Score(String title, int term) {
		super();
		this.title = title;
		this.term = term;
		
	}
	//복사생성자
	public Score(Score s) {
		this(s.title, s.term, s.midScore, s.finalScore, s.performance);
	}
	
	
	
	//메소드 : equals() : 성적 추가 시 활용, toString() 성적 출력시 활용
	//		getter/setter
	
	//생성자 : 학기, 중간, 기말, 수행평가가 필요한 생성자
	
	//		: 과목, 학기가 필요한 생성자(성적이 같은지 확인할 때)
}
