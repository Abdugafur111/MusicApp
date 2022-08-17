package music.player.mp3;

import music.player.mp3.Controllers.SongController;
import music.player.mp3.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class MusicApplication {




    public static void main(String[] args) {
      ApplicationContext context =  SpringApplication.run(MusicApplication.class, args);
        StorageService storageService = context.getBean(StorageService.class);
        storageService.getSongFileNames();



    }

}
