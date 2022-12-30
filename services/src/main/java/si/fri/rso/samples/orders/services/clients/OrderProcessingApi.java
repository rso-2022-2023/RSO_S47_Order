package si.fri.rso.samples.orders.services.clients;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.concurrent.CompletionStage;

import si.fri.rso.samples.orders.services.dtos.OrderProcessRequest;

@Path("process")
@RegisterRestClient(configKey="image-processing-api")
@Dependent
public interface OrderProcessingApi {

    @POST
    CompletionStage<String> processImageAsynch(OrderProcessRequest imageProcessRequest);

}
