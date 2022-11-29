package SE320.Hw4.src;

public class Question3 {
    private String fristname;
    private String lastName;

    public boolean equals(Object obj){
        if(!(obj instanceof Question3)) return false;
        Question3 that = (Question3) obj;
        return this.lastName.toUpperCase().equals(that.lastName.toUpperCase());
    }

    public int hashCode(){
        //TODO
        return lastName.hashCode();

    }

} 

