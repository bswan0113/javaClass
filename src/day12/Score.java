package day12;

public class Score {
	private int math, eng, kor, phy, music;
	private int semester;
	private boolean midFinal;
	

	public void setScore() {
	System.out.println("수학,영어, 한국어, 체육, 음악 성적을 차례대로 입력해주세요.");
		
	}
	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public boolean isMidFinal() {
		return midFinal;
	}

	public void setMidFinal(boolean midFinal) {
		this.midFinal = midFinal;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}
	

	

}
