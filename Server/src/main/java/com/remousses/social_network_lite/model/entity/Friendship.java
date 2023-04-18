package com.remousses.social_network_lite.model.entity;

//@Getter
//@Setter
//@NoArgsConstructor
//@IdClass(Friendship.PK.class)
//public class Friendship {
//
//    @Id
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;
//
//    @Id
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id_friend", referencedColumnName = "id")
//    private User friend;
//
//    @Getter
//    @Setter
//    @EqualsAndHashCode
//    public static class PK implements Serializable {
//        Long user;
//        Long friend;
//    }
//}

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "friendship")
public class Friendship {

    @EmbeddedId
    private FriendshipId friendshipId;

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @Embeddable
    public static class FriendshipId implements Serializable {

        private static final long serialVersionUID = 2124077311171282494L;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        @ManyToOne
        @JoinColumn(name = "user_id_friend")
        private User friend;
    }
}