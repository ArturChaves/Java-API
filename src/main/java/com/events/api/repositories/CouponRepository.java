package com.events.api.repositories;

import com.events.api.domain.coupon.Coupon;
import com.events.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
