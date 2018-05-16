package com.github.egatlovs.sample.camunda.listeners.startvariables;

import com.github.egatlovs.sample.camunda.listeners.startvariables.entity.StartVariable;
import com.github.egatlovs.variablemanager.managers.ExecutionManager;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Inject;
import javax.inject.Named;

@Named("startVariableListener")
public class StartVariableListener implements JavaDelegate {

    @Inject
    private ExecutionManager manager;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        manager.setVariable(new StartVariable());
    }

}
