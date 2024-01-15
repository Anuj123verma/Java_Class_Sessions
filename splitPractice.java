public class splitPractice {
    public static void main(String args[]) {
      // "[, /]"
      
      // Splitting of the string
      String s = "Doe, John 5/15/65";
      String[] str = s.split(", "); // this the way to decalre array in Java
      // s.split will return the array of the string
      for(int i=0;i<str.length;i++){
          System.out.printf("Value of the string(s) at index %d is %s%n", i, str[i]);
      }
      
      String[]  str1 = str[1].split(" ");
      for(int i=0;i<str1.length;i++){
          System.out.printf("Value of the string(str) at index %d is %s%n", i, str1[i]);
      }
      
      String[] str2 = str1[1].split("/");
      for(int i=0;i<str2.length;i++){
          System.out.printf("Value of the string(str1) at index %d is %s%n", i, str2[i]);
      }
      
    }
}

// d f -> what is the type of primitive data
// %2 %10 -> how many characters this primitive data will acquire

// 2 / 10 means two places are reserved
// 4 3  space1421    421 
// 0.2 0.4 0.6 

// String to integer conversion is invlaid
// but we can convert integer to string in formatting as we know inside formatter everything is going to converted into string

// public class MyClass {
//     public static void main(String args[]) {
//       // String -> immutable
//       // StringBuilder -> mutable
//       // StringBuffer -> mutable
//       // If you have declared a string and you don't want to change in that case it is better to use String class
//       // If you have declared a string and you want to change you should use StringBuilder class or StringBuffer
//       // StringBuilder is intended to use for mutlithread program and String Buffer is inteded to use for singel threaded program
//       // Wherever you have to use mutlithreading go for StringBuilder
//       // Homework is to read about Threads
//       // let's discuss about the different functions of StringBuilder
      
//       StringBuilder sb = new StringBuilder("Hello World");
//       sb.append("\nI am Nil");
//       //System.out.println(sb);
//       sb.append("\nMy age is ");
//       //System.out.println(sb);
//       sb.append(18);
//       //System.out.println(sb);
//       sb.append("\nMy percentage in 12th grade is ");
//       //System.out.println(sb);
//       sb.append(90.5);
//       System.out.println(sb);
      
      
//       // delete the code
//       // delete take two arguments , start index and end index
//       // it deletes the character from start to end-1
//       System.out.println(sb.delete(0, 12));
      
//       // insert -> insert any data type in the substring
//       // insert -> it takes two arguments offset and data type to be inserted
//       // offset is the index in string from which you want to add the data type / variable of any data type
//       // wherever you want to insert the string find the index at that position and do +1
//       System.out.println(sb.insert(sb.length(), "\nMy hometown is in US"));
      
//       // All the operations we did on one object no new object is created while doing any operation
      
//       // replace -> used to replace the characters with the given character
//       // replace takes three arguments -> start end and string
//       // start is the starting index in the StringBuilder
//       // end is the ending index in the StringBuilder 
//       // string is the string that we can use for replacement
//       // replacement will be done in in the range of start , end-1 or [start. end)
//       System.out.println(sb.replace(sb.length()-2, sb.length(), "Saudi Arabia"));
      
//     }
// }

// // d f -> what is the type of primitive data
// // %2 %10 -> how many characters this primitive data will acquire

// // 2 / 10 means two places are reserved
// // 4 3  space1421    421 
// // 0.2 0.4 0.6 

// // String to integer conversion is invlaid
// // but we can convert integer to string in formatting as we know inside formatter everything is going to converted into string