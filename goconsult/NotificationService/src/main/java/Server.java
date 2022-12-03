import com.goconsult.service.NotificationService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("in Notification Service");
        io.grpc.Server server= ServerBuilder.forPort(8083).addService(new NotificationService()).build();
        server.start();
        System.out.println("Notification Server started on:"+server.getPort());

        server.awaitTermination();

    }
}
