package uz.bunyodbek;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    private MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {

            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();

            info(chatId, firstName, lastName, text);


            if (text.equals("/start")) {
                try {
                    execute(myBotService.sendMessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("/photo")) {

                try {
                    execute(myBotService.sendPhoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }

            if (text.equals("/document")) {
                try {
                    execute(myBotService.sendDocument(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (text.equals("menu")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("location")) {
                try {
                    execute(myBotService.sendLocation(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("manzil")) {
                try {
                    execute(myBotService.shareLocation(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("button")){
                try {
                    execute(myBotService.sendMessageREply(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("korzinka")){
                try {
                    execute(myBotService.asosiyButton(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDC4DBiz haqimizda")){
                try {
                    execute(myBotService.bizhaqimizda(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



        }
        if (update.hasMessage() && update.getMessage().hasContact()) {

        }


    }

    @Override
    public String getBotUsername() {
        return "Javaqoshimcha1910Bot";
    }

    @Override
    public String getBotToken() {
        return "8051563921:AAEYzktombWT6e_YJNpIAk9Xd4dCmdRPnTM";
    }


    public void info(Long chatId, String firstName, String lastName, String text) {

        System.out.println(" ChatId : " + chatId + "\n" +
                " FirstName : " + firstName + "\n" +
                " LastName : " + lastName + "\n" +
                " Text : " + text);
    }


}
