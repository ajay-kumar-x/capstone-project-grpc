import com.goconsult.interceptor.serverInterceptor;
import com.goconsult.service.BookingService;
import com.goconsult.service.ProfileService;
import com.goconsult.service.SearchService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("in User Service");
        io.grpc.Server server= ServerBuilder.forPort(8082).addService(new ProfileService()).addService(new SearchService()).addService(new BookingService())
                .intercept(new serverInterceptor()).build();
        server.start();
        System.out.println("User Server started on:"+server.getPort());

        server.awaitTermination();

    }
}
