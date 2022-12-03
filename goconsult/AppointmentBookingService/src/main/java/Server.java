import com.goconsult.service.BookingService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("in Booking Service");
        io.grpc.Server server= ServerBuilder.forPort(8085).addService(new BookingService()).build();
        server.start();
        System.out.println("Booking Server started on:"+server.getPort());

        server.awaitTermination();

    }
}
