package cnLabs.usermicroservice.Clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartServiceClient {

    @Autowired
    @LoadBalanced
    RestTemplate restTemplate;

    public void deleteUserCart(Long userId) {
        restTemplate.postForEntity("http://CART-MICROSERVICE/user/events/" + userId, null, String.class);  // Removed the ResponseEntity because I'm not sure what to do with it.
    }
}
