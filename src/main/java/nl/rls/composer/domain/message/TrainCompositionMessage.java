package nl.rls.composer.domain.message;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.rls.composer.domain.CompositIdentifierOperationalType;
import nl.rls.composer.domain.GenericMessage;
import nl.rls.composer.domain.Train;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author berend.wilkens
 * <p>
 * Train Composition message This message must be sent from the
 * RU to the next RU, defining the composition of the train. This
 * message must also be sent from the RU to the IM(s) when requested by
 * the Conventional Rail TSI Operation and Traffic Management or by the
 * contract between IM and RU. Whenever there is a change in the
 * composition during the journey of a train, the RU responsible has to
 * update this message to all parties involved. The information, which
 * must be transmitted and be accessible, is: — train number and path
 * number to identify the path, — path departure point and date and time
 * for which the path was requested, — path destination point and date
 * and time at which the proposed train is due to arrive at its
 * destination, — loco(s) identification and position of loco(s) in the
 * train, — train length, train weight, maximum speed of the train, —
 * train composition with the sequence of vehicle IDs, — command and
 * control system including type of radio equipment, — information
 * concerning exceptional gauging, — UN/RID numbers of dangerous goods,
 * — indication if livestock and people (other than the train crew) will
 * be carried, — braking system to be used, — wagon data. After the
 * receipt of the train composition the IM may verify the entries
 * against the contracted path, if the contract between IM and RU
 * explicitly allows this. In that case the IM must have easy access to
 * the information about possible restrictions in the relevant
 * infrastructure, to the technical wagon data (Chapter 4.2.11.3: The
 * Rolling Stock Reference Databases), to the dangerous goods reference
 * file and to the current, updated information status on the wagons
 * (Chapter 4.2.12.2: Other databases , Wagon and Intermodal Unit
 * Operational Database). This refers to all wagons on the train. In
 * that case also, the IM, who manages his train paths and keeps up the
 * actual status of the path information, must add the train details of
 * the train composition to the path and train data as mentioned in
 * Chapter 4.2.2.1 (Path request, Preliminary remarks).
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
public class TrainCompositionMessage extends GenericMessage {
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "train_composition_message_id")
    private List<CompositIdentifierOperationalType> compositIdentifierOperationalType = new ArrayList<CompositIdentifierOperationalType>();
    @ManyToOne(cascade = CascadeType.DETACH)
    private Train train;
    public TrainCompositionMessage(Integer ownerId) {
        super(ownerId);
    }


}
