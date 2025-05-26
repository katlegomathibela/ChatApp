import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class QuickChat {

private String messageID;
private int messageNumber;
private String recipient;
private String text;
private String messageHash;
private static int messageCount = 0;

public QuickChat (String recipient, String text){
this.messageID = generateMessageID();
this.messageNumber = ++messageCount;
this.recipient = recipient;
this.text = text;
this.messageHash = createMessageHash();
}

private String generateMessageID(){
Random randNO = new Random();
long num = (long)(randNO.nextDouble() * 100000000L);
return String.format("%010d", num);
}

public boolean checkMessageID(){
  return messageID.length() == 10;  
}
public int checkRecipientCell(){
return (recipient.startsWith("+") && recipient.length() <= 10) ? 1 : 0;
}
public String createMessageHash(){
    String[] words = text.trim().split("\\s+");
String firstWord = words[0].toUpperCase();
String lastWord = words[words.length - 1].toUpperCase();
return messageID.substring(0,2) + ":" + messageNumber + ":" + firstWord + lastWord;

}
public String sentMessage(String choice){
   switch (choice.toLowerCase()){
       case "send":
         return "Message successfully sent.";
       case "disregard":
         return "Press 0 to delete message.";
       case "store":
         return "Message successfully stored.";
       default:
         return "Invalid option.";  
   } 
   }
public String printTotalMessages(){
    return messageCount;
}
@SuppressWarnings("unchecked")//REFERENCE ChatGPT
public void storeMessage(){
 JSONObject messageData = new JSONObject();
 messageData.put("messageID" , messageID);
messageData.put("messageNumber" ,messageNumber );
messageData.put("recipient", recipient);
messageData.put("text", text);
messageData.put("messageHash", messageHash);

org.json.simple.JSONArray messageArray = new org.json.simple.JSONArray();

java.io.File file = new java.io.File("stored_message.json");

try {
    if (file.exists()) {
    java.io.FileReader reader = new java.io.FileReader(file);
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(reader);
    StringBuilder content = new StringBuilder();
    String line;
    
    while ((line = bufferedReader.readLine()) != null) {
        content.append(line);
    }
    bufferedReader.close();
    
    
     Object obj = new org.json.simple.parser.JSONParser().parse(content.toString());
     if (obj instanceof org.json.simple.JSONArray) {
     messageArray = (org.json.simple.JSONArray) obj;    
     }
    }
    
     messageArray.add(messageData);
     
     try (FileWriter write = new FileWriter(file)) {
      writer.write(messagerArray.toJSONString());
     }
    } catch (Exception e) {
        throw new RuntimeException("Error storing message: " + e.getMessage());
    }
     }
    private String format(String d, long num) {
        throw new UnsupportedOperationException("Not supported yet.");



}


}
