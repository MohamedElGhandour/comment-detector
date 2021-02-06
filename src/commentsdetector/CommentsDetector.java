/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commentsdetector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ghandour
 */
public class CommentsDetector {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
 public static void main (String[] args) throws Exception {

        String path = "/home/ghandour/Desktop/comments.java";

        try {
            // default StandardCharsets.UTF_8
            String content = Files.readString(Paths.get(path));
            //System.out.println(content);
            Pattern pattern = Pattern.compile("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)");
            Matcher matcher = pattern.matcher(content);
            while(matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
        

    }
    
}
