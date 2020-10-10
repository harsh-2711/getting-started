package daiict.slop.springboot_starterproject.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * Database Entity-USER
 * @version 1.0
 * @since Oct 8, 2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"User\"")
class User {
    @Id
    @GeneratedValue
    var userId = 0
    var name: String? = null
    var phoneNumber: String? = null
    var emailAddress: String? = null
}