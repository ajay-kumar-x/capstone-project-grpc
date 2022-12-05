
import com.goconsult.service.AuthService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws InterruptedException, IOException {


        System.out.println("in Auth Service");
        io.grpc.Server server= ServerBuilder.forPort(8080).addService(new AuthService()).build();

        server.start();
        System.out.println("Auth Server started on:"+server.getPort());

        server.awaitTermination();

    }
}