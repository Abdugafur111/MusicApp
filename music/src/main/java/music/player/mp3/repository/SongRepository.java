package music.player.mp3.repository;

import music.player.mp3.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song,String> {
boolean existsSongByFileNameEquals(String fileName);

boolean existsSongByTitleEquals(String title);

Song findSongByFileName(String fileName);
}

