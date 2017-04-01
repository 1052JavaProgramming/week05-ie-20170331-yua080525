package hw;

/**
 * Created by user on 2017/4/1.
 */
public class Student {
        String name, id ;
        int score;
        public Student(String name1,String id1,int score1){
            this.name = name1;
            this.id = id1;
            this.setScore(score1);
        }

        public void setName(String name1){this.name = name1;}
        public  void setId(String id1){this.id = id1;}
        public void setScore(int score1){this.score = score1;}

        public String getName(){return name;}
        public String getId(){return id;}
        public int getScore(){return score;}

        public String getInfo(){return this.getName()+",("+this.getId()+"),"+this.getScore();}
}
