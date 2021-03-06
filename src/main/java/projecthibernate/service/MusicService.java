package projecthibernate.service;

import java.io.Serializable;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import projecthibernate.entity.Music;
import projecthibernate.repository.YourJpaRepository;

@Service
@Configuration
public class MusicService extends YourJpaRepository<Music> implements Serializable {

	private static final long serialVersionUID = 1L;

}
