package guru.springframework.services;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;


@Component
public class SendTextMessageServiceImpl implements SendTextMessageService {

	private static final String EXCHANGE = "app-exchange";
	private static final String ROUTING_KEY = "app-routing-key";
	private Queue textMessageQueue;
	private RabbitTemplate rabbitTemplate;

	public SendTextMessageServiceImpl(Queue textMessageQueue, RabbitTemplate rabbitTemplate) {
		this.textMessageQueue = textMessageQueue;
		this.rabbitTemplate = rabbitTemplate;
	}

	@Override
	public void sendTextMessage(String msg) {
		this.rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, msg);
		System.out.println("##################Sending the message " + msg);
	}
}
