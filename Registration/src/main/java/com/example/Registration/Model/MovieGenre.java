package com.example.Registration.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name ="genre")
public class MovieGenre {
	
	
		@Id
		@Column(name ="genre_id")
	    private int id;
		
		@Column(name ="genre_name")
		private String genreName;

	    public int getId() { return id; }

	    public void setId(int id) {
	        this.id = id;
	    }

		public String getGenreName() {
			return genreName;
		}

		public void setGenreName(String genreName) {
			this.genreName = genreName;
		}
}
