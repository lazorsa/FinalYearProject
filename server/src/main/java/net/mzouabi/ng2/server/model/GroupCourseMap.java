
package net.mzouabi.ng2.server.model;
/**
 * Created by Jayani on 08/15/17.
 */
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "groupcoursemap")
public class GroupCourseMap {

    @Id
    @Column(name = "id")
    public int id;

    @Column(name = "group_id")
    public int groupId;

    @Column(name = "course_id")
    public int courseId;

    public int getGroupId() { return groupId; }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseid(int courseId) { this.courseId = courseId; }
}