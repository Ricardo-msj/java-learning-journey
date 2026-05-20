public class Banco{
    private double valueAccount = 1000;
    private String userCPF = "00000000000";
    private String nameUser = "none";

    //PARY SETTER

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setUsercpf(String CPF){
        this.userCPF = CPF;
    }

    //PARY GETTER

    public double getValueAccount() {
        return valueAccount;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getUserCPF() {
        return userCPF;
    }

    //FUNCTION
    
    public  String checkBalance(){
        return "Your balance is: " + valueAccount;
    }

    public String receivBalance(double valueSum){

        if (valueSum < 0)
            {return "Value Incorrect!!!";}
        else
            {valueAccount += valueSum;
            return "Value Receved";}
    }

    public String transferBalance(double valueSubtract){

        if(valueSubtract <= 0)
            {return "Value Incorrect!!!";}

        else if (valueSubtract > valueAccount)
            {return "Value higther than the account!!!!";}
        
        else
            {valueAccount -= valueSubtract;
            return "Value Transfered!!!";}
    }

}