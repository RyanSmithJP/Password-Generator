import java.util.Random;
public class Password {
    private String password = "";
    Password(){
        this.password = generatePassword();
    }
	    private String generatePassword() {
        Random rd = new Random();
        //generate random char from this selection of characters
        String randomCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~`! @#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
        String password = "";
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSymbol = false;
        //16-20 characters in length
        do {
        	hasUpperCase = false;
            hasLowerCase = false;
            hasNumber = false;
            hasSymbol = false;
	        for(int i = 0; i < 20; i++){
	           password+=randomCharacters.charAt(rd.nextInt(randomCharacters.length()))+"";
	           if(Character.isLowerCase(password.charAt(i))){
	        	   hasLowerCase = true;
	           }
	           else if(Character.isUpperCase(password.charAt(i))){
	        	   hasUpperCase = true;
	           }
	           else if(password.substring(i,i+0).matches("[0-9]")) {
	        	   hasNumber = true;
	           }
	           else {
	        	   hasSymbol = true;
	           }
	        }
        }while(hasUpperCase == false && hasLowerCase == false && hasNumber == false && hasSymbol == false);
        return password;
    }
    public String getPassword(){
        return this.password;
    }
}

