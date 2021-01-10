package ru.home.mytelegram_bot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.home.mytelegram_bot.MyWizardTelegramBot;

@RestController
public class WebhookController {
    private final MyWizardTelegramBot telegramBot;

    public WebhookController(MyWizardTelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update){
        return telegramBot.onWebhookUpdateReceived(update);
    }
}
