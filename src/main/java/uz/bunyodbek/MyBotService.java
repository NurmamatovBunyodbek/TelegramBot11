package uz.bunyodbek;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {


    public SendMessage sendMessage(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Xush kelibsiz");
        return sendMessage;
    }

    public SendPhoto sendPhoto(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/ZsmkoSJGMyjXErZf8"));

        sendPhoto.setCaption(" Bu siz google dan yuklagan rasm");
        return sendPhoto;
    }


    public SendDocument sendDocument(Long chatId) {

        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(new InputFile(new File("C:\\Users\\PDP Junior Sergeli\\Desktop\\Java\\lesson3.pptx")));
        sendDocument.setCaption("Lesson3 uchun ppt");
        return sendDocument;

    }


    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = new SendMessage();

        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                
                <a href="https://dasturlash.uz/lesson/java/article/java_kirish"> Javaga kirish </a>
                """);

        sendMessage.setParseMode(ParseMode.HTML);

        return sendMessage;

    }

    public SendLocation sendLocation(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.2583223);
        sendLocation.setLongitude(69.2240449);
        return sendLocation;
    }

    public SendMessage shareLocation(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Manzilni jonating");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("ShareLocation");
        keyboardButton.setRequestLocation(true);
        row.add(keyboardButton);
        rowList.add(row);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    public SendMessage sendMessageREply(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Quyidagi buttonlardan birini tanlang");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Photo");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Document");
        row.add(button1);
        //  rowList.add(row1);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


    public SendMessage asosiyButton(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xush kelibsiz, men HR-bot Korzinka");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("\uD83D\uDC4DBiz haqimizda");
        row.add(button);
        rowList.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Qaynoqqina vakansiyalar");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Bo'sh ish o'rinlari");
        row2.add(button2);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Til");
        row3.add(button3);
        rowList.add(row3);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    public SendMessage bizhaqimizda(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Anglesey Food (tm: korzinka) " +
                "1996-yilda tashkil etilgan va u O‘zbekistondagi birinchi " +
                "supermarketlar tarmog‘iga aylandi.  Bugun mubolag‘asiz " +
                "aytish mumkinki, har kuni o‘n minglab mijozlarga xizmat " +
                "ko‘rsatuvchi “Korzinka” milliy brendga, xalq nomiga aylanib " +
                "ulgurdi. Biz uchun mijozlarimizning ishonchi va sadoqati " +
                "katta yutug‘imizdir.");
        sendMessage.setText("""
                <a href="www.korzinka.uz">Korzinka sayt</a>
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        return sendMessage;

    }

public  SendPhoto sendPhoto(){
        return sendPhoto(null );
}




}
