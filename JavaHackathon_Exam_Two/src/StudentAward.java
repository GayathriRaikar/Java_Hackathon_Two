
public class StudentAward implements Comparable<StudentAward> {

	String stuName;
	int stuReg;
	double stuScore;

	public StudentAward(String name, int reg, double score) {
		this.stuName = name;
		this.stuReg = reg;
		this.stuScore = score;
	}

	@Override
	public int compareTo(StudentAward nextStu) {

		return Double.compare(this.stuScore, nextStu.stuScore);
	}

}
