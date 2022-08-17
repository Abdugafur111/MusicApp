package music.player.mp3.services;

import music.player.mp3.model.Song;
import music.player.mp3.repository.SongRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public Song findSongByFileName(String fileName){
        return songRepository.findSongByFileName(fileName);
    }

}
