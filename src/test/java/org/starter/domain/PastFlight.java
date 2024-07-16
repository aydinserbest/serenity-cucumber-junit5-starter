package org.starter.domain;

import java.time.LocalDate;

public record PastFlight(String flightNumber,
                         LocalDate scheduledDate,
                         FlightStatus status) {}


