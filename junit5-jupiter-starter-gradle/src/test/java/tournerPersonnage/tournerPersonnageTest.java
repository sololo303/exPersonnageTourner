package tournerPersonnage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class tournerPersonnageTest {
    @Test
    void tournerPersonnage() {
        //GIVEN
        tournerPersonnage.Orientation orientation;

        //WHEN
        orientation= tournerPersonnage.tourner(1);

        //THEN

        assertThat(orientation).isEqualTo(tournerPersonnage.Orientation.NORD);

    }

}