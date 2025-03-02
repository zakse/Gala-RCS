class Student extends Person {
    String studyProgram;

    public Student(String vards, String uzvards, int vecums, double augums_m, double svars, String valsts, double ienakumi_menesi, boolean patikProgramet, String studyProgram) {
        super();
        this.studyProgram = studyProgram;
    }

    public Student () {

    }

    public void studyInfo() {
        System.out.println("Studiju programma: " + studyProgram);
    }
}