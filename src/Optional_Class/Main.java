package Optional_Class;

import java.util.Optional;

public class Main {

    public static Optional<String> getName(){

        String name = "Ram";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {

          String str = "Hello welcome to Optional classes";
        // String str = null;

        if(str == null){
            System.out.println("null string");
        }else {
            System.out.println(str.length());
        }

        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("null string"));


        Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse("null string"));
    }
}
