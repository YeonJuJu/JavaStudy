import java.io.*;

class Score implements Serializable{
    private String subject;
    private int score;

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }

    @Override
    public String toString(){
        return subject + " " + score;
    }
}

public class Ex11 {
    public static void main(String[] args){
        Score score = new Score();

        score.setSubject("국어");
        score.setScore(100);

        FileOutputStream fos = null;
        FileInputStream fis = null;

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            fos = new FileOutputStream("c:\\EclipseIo\\DataTest.txt");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(score);
            oos.close();

            fis = new FileInputStream("c:\\EclipseIo\\DataTest.txt");
            ois = new ObjectInputStream(fis);

            Score score1 = (Score) ois.readObject();

            System.out.println("scores : " + score1);

            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
