package net.floodlightcontroller.savi.service;

import java.util.List;
import java.util.Set;

import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.devicemanager.SwitchPort;
import net.floodlightcontroller.savi.action.Action;
import net.floodlightcontroller.savi.binding.Binding;

public interface SAVIProviderService extends IFloodlightService {
	
	public void addSAVIService(SAVIService service);
	public boolean pushActions(List<Action> actions);
	public boolean addSecurityPort(SwitchPort switchPort);
	public boolean delSecurityPort(SwitchPort switchPort);
	public Set<SwitchPort> getSecurityPorts();
	public List<Binding<?>> getBindings();

}
