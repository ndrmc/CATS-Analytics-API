package com.cats.analytics.services;

import com.cats.analytics.domain.Dispatch;
import com.cats.analytics.repositories.DispatchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by User on 10/12/2017.
 */
@Service
public class DispatchServiceImpl implements DispatchService {
    private DispatchRepository dispatchRepository;
    @Autowired
    private void setDispatchRepository(DispatchRepository dispatchRepository){
        this.dispatchRepository = dispatchRepository;
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Iterable<Dispatch> listAllDispatches() {
        return dispatchRepository.findAll();
    }

    @Override
    public Dispatch getDispatchById(Integer id) {
        return null;
    }

    @Override
    public Dispatch insertDispatch(Dispatch dispatch) {
       return dispatchRepository.save(dispatch);
    }

    @Override
    public Dispatch saveDispatch(Dispatch dispatch) {
        return dispatchRepository.save(dispatch);
    }

    @Override
    public void deleteDispatch(String id) {
        dispatchRepository.delete(id);
    }
}
