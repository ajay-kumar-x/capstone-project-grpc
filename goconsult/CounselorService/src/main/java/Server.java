import com.goconsult.interceptor.serverInterceptor;
import com.goconsult.service.CounselorService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {


        System.out.println("in Counselor Service");
        io.grpc.Server server= ServerBuilder.forPort(8081).addService(new CounselorService())
                .intercept(new serverInterceptor()).build();
        server.start();
        System.out.println("Counselor Server started on:"+server.getPort());

        server.awaitTermination();

    }
}
