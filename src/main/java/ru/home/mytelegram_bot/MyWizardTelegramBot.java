package ru.home.mytelegram_bot;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyWizardTelegramBot extends TelegramWebhookBot {
    private String  webHookPath;
    private String botUserName;
    public  String botToken;

    public MyWizardTelegramBot(DefaultBotOptions botOptions){
        super(botOptions);
    }
    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return null;
    }

    @Override
    public String getBotPath() {
        return null;
    }
    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        if (update.getMessage() !=null && update.getMessage().hasText()){
        long chat_id = update.getMessage().getChatId();
/*
         try {
             execute(new SendMessage(chat_id,"Hi")+update.getMessage().getText());
             }catch (TelegramApiException e){
             e.printStackTrace();
         }*/

        }

        return null;
    }
    public void setWebHookPath(String webHookPath){
        this.webHookPath = webHookPath;
    }
    public void setBotUserName(String botUserName){
        this.botUserName = botUserName;
    }
    public void setBotToken(String botToken){
        this.botToken = botToken;
    }

}
