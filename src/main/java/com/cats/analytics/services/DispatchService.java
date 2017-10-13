package com.cats.analytics.services;

import com.cats.analytics.domain.Dispatch;
import org.springframework.stereotype.Service;

/**
 * Created by User on 10/12/2017.
 */

public interface DispatchService {

    Iterable<Dispatch> listAllDispatches();
    Dispatch getDispatchById(Integer id );
    Dispatch saveDispatch(Dispatch dispatch);
    Dispatch insertDispatch(Dispatch dispatch);
    void deleteDispatch(String id);
}
