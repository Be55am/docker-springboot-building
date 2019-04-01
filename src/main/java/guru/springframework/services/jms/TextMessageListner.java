package guru.springframework.services.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class TextMessageListner {


	private static final Logger log = LoggerFactory.getLogger(TextMessageListner.class);


	@RabbitListener(queues = "app-queue")
	public void receiveMessageForApp2(String reqObj) {
		System.out.println("#########################################################");
		System.out.println("#########################################################");
		System.out.println("#########################################################");
		System.out.println("########################GOT A MESSAGE####################");
		System.out.println(reqObj);
		System.out.println("#########################################################");
		System.out.println("#########################################################");
		System.out.println("#########################################################");


	}

}
