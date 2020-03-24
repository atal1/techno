
package practise;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "StandardHeader", "Body" })
public class Order {

	@JsonProperty("StandardHeader")
	private StandardHeader standardHeader;
	@JsonProperty("Body")
	private List<Body> body = new ArrayList<Body>();

	@JsonProperty("StandardHeader")
	public StandardHeader getStandardHeader() {
		return standardHeader;
	}

	@JsonProperty("StandardHeader")
	public void setStandardHeader(StandardHeader standardHeader) {
		this.standardHeader = standardHeader;
	}

	public Order withStandardHeader(StandardHeader standardHeader) {
		this.standardHeader = standardHeader;
		return this;
	}

	@JsonProperty("Body")
	public List<Body> getBody() {
		return body;
	}

	@JsonProperty("Body")
	public void setBody(List<Body> body) {
		this.body = body;
	}

	public Order withBody(List<Body> body) {
		this.body = body;
		return this;
	}

}

class StandardHeader {

	@JsonProperty("SendingTime")
	private String sendingTime;
	@JsonProperty("WMHeader")
	private WMHeader wMHeader;

	@JsonProperty("SendingTime")
	public String getSendingTime() {
		return sendingTime;
	}

	@JsonProperty("SendingTime")
	public void setSendingTime(String sendingTime) {
		this.sendingTime = sendingTime;
	}

	public StandardHeader withSendingTime(String sendingTime) {
		this.sendingTime = sendingTime;
		return this;
	}

	@JsonProperty("WMHeader")
	public WMHeader getWMHeader() {
		return wMHeader;
	}

	@JsonProperty("WMHeader")
	public void setWMHeader(WMHeader wMHeader) {
		this.wMHeader = wMHeader;
	}

	public StandardHeader withWMHeader(WMHeader wMHeader) {
		this.wMHeader = wMHeader;
		return this;
	}
}

class Body {

	@JsonProperty("Entities")
	private List<Entity> entities = new ArrayList<Entity>();

	@JsonProperty("Entities")
	public List<Entity> getEntities() {
		return entities;
	}

	@JsonProperty("Entities")
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

	public Body withEntities(List<Entity> entities) {
		this.entities = entities;
		return this;
	}

}

class Entity {

	@JsonProperty("BaseReference")
	private BaseReference baseReference;
	@JsonProperty("OrderID")
	private String orderID;
	@JsonProperty("ManualOrderIndicator")
	private String manualOrderIndicator;
	@JsonProperty("PreviouslyReported")
	private String previouslyReported;
	@JsonProperty("Currency")
	private String currency;
	@JsonProperty("Side")
	private String side;
	@JsonProperty("OrdType")
	private String ordType;
	@JsonProperty("TimeInForce")
	private String timeInForce;
	@JsonProperty("TradeDate")
	private Integer tradeDate;
	@JsonProperty("TransactTime")
	private String transactTime;
	@JsonProperty("Instrument")
	private Instrument instrument;
	@JsonProperty("OrderQtyData")
	private OrderQtyData orderQtyData;
	@JsonProperty("InitialOrderDate")
	private String initialOrderDate;
	@JsonProperty("WMEntityExtRefID")
	private WMEntityExtRefID wMEntityExtRefID;
	@JsonProperty("Parties")
	private List<Party> parties = new ArrayList<Party>();
	@JsonProperty("TrdRegTimestamps")
	private List<TrdRegTimestamp> trdRegTimestamps = new ArrayList<TrdRegTimestamp>();

	@JsonProperty("BaseReference")
	public BaseReference getBaseReference() {
		return baseReference;
	}

	@JsonProperty("BaseReference")
	public void setBaseReference(BaseReference baseReference) {
		this.baseReference = baseReference;
	}

	public Entity withBaseReference(BaseReference baseReference) {
		this.baseReference = baseReference;
		return this;
	}

	@JsonProperty("OrderID")
	public String getOrderID() {
		return orderID;
	}

	@JsonProperty("OrderID")
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Entity withOrderID(String orderID) {
		this.orderID = orderID;
		return this;
	}

	@JsonProperty("ManualOrderIndicator")
	public String getManualOrderIndicator() {
		return manualOrderIndicator;
	}

	@JsonProperty("ManualOrderIndicator")
	public void setManualOrderIndicator(String manualOrderIndicator) {
		this.manualOrderIndicator = manualOrderIndicator;
	}

	public Entity withManualOrderIndicator(String manualOrderIndicator) {
		this.manualOrderIndicator = manualOrderIndicator;
		return this;
	}

	@JsonProperty("PreviouslyReported")
	public String getPreviouslyReported() {
		return previouslyReported;
	}

	@JsonProperty("PreviouslyReported")
	public void setPreviouslyReported(String previouslyReported) {
		this.previouslyReported = previouslyReported;
	}

	public Entity withPreviouslyReported(String previouslyReported) {
		this.previouslyReported = previouslyReported;
		return this;
	}

	@JsonProperty("Currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("Currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Entity withCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	@JsonProperty("Side")
	public String getSide() {
		return side;
	}

	@JsonProperty("Side")
	public void setSide(String side) {
		this.side = side;
	}

	public Entity withSide(String side) {
		this.side = side;
		return this;
	}

	@JsonProperty("OrdType")
	public String getOrdType() {
		return ordType;
	}

	@JsonProperty("OrdType")
	public void setOrdType(String ordType) {
		this.ordType = ordType;
	}

	public Entity withOrdType(String ordType) {
		this.ordType = ordType;
		return this;
	}

	@JsonProperty("TimeInForce")
	public String getTimeInForce() {
		return timeInForce;
	}

	@JsonProperty("TimeInForce")
	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	public Entity withTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
		return this;
	}

	@JsonProperty("TradeDate")
	public Integer getTradeDate() {
		return tradeDate;
	}

	@JsonProperty("TradeDate")
	public void setTradeDate(Integer tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Entity withTradeDate(Integer tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	@JsonProperty("TransactTime")
	public String getTransactTime() {
		return transactTime;
	}

	@JsonProperty("TransactTime")
	public void setTransactTime(String transactTime) {
		this.transactTime = transactTime;
	}

	public Entity withTransactTime(String transactTime) {
		this.transactTime = transactTime;
		return this;
	}

	@JsonProperty("Instrument")
	public Instrument getInstrument() {
		return instrument;
	}

	@JsonProperty("Instrument")
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Entity withInstrument(Instrument instrument) {
		this.instrument = instrument;
		return this;
	}

	@JsonProperty("OrderQtyData")
	public OrderQtyData getOrderQtyData() {
		return orderQtyData;
	}

	@JsonProperty("OrderQtyData")
	public void setOrderQtyData(OrderQtyData orderQtyData) {
		this.orderQtyData = orderQtyData;
	}

	public Entity withOrderQtyData(OrderQtyData orderQtyData) {
		this.orderQtyData = orderQtyData;
		return this;
	}

	@JsonProperty("InitialOrderDate")
	public String getInitialOrderDate() {
		return initialOrderDate;
	}

	@JsonProperty("InitialOrderDate")
	public void setInitialOrderDate(String initialOrderDate) {
		this.initialOrderDate = initialOrderDate;
	}

	public Entity withInitialOrderDate(String initialOrderDate) {
		this.initialOrderDate = initialOrderDate;
		return this;
	}

	@JsonProperty("WMEntityExtRefID")
	public WMEntityExtRefID getWMEntityExtRefID() {
		return wMEntityExtRefID;
	}

	@JsonProperty("WMEntityExtRefID")
	public void setWMEntityExtRefID(WMEntityExtRefID wMEntityExtRefID) {
		this.wMEntityExtRefID = wMEntityExtRefID;
	}

	public Entity withWMEntityExtRefID(WMEntityExtRefID wMEntityExtRefID) {
		this.wMEntityExtRefID = wMEntityExtRefID;
		return this;
	}

	@JsonProperty("Parties")
	public List<Party> getParties() {
		return parties;
	}

	@JsonProperty("Parties")
	public void setParties(List<Party> parties) {
		this.parties = parties;
	}

	public Entity withParties(List<Party> parties) {
		this.parties = parties;
		return this;
	}

	@JsonProperty("TrdRegTimestamps")
	public List<TrdRegTimestamp> getTrdRegTimestamps() {
		return trdRegTimestamps;
	}

	@JsonProperty("TrdRegTimestamps")
	public void setTrdRegTimestamps(List<TrdRegTimestamp> trdRegTimestamps) {
		this.trdRegTimestamps = trdRegTimestamps;
	}

	public Entity withTrdRegTimestamps(List<TrdRegTimestamp> trdRegTimestamps) {
		this.trdRegTimestamps = trdRegTimestamps;
		return this;
	}

}

class BaseReference {

	@JsonProperty("EntityOID")
	private String entityOID;
	@JsonProperty("WMEntityVersionID")
	private String wMEntityVersionID;
	@JsonProperty("WMpartition")
	private String wMpartition;
	@JsonProperty("RootID")
	private String rootID;
	@JsonProperty("parentEntityID")
	private String parentEntityID;
	@JsonProperty("EntityType")
	private String entityType;
	@JsonProperty("EntityStatus")
	private String entityStatus;
	@JsonProperty("WMEntitySchemaName")
	private String wMEntitySchemaName;
	@JsonProperty("WMEntitySchemaVersion")
	private String wMEntitySchemaVersion;
	@JsonProperty("WMEntitySchemaCode")
	private String wMEntitySchemaCode;

	@JsonProperty("EntityOID")
	public String getEntityOID() {
		return entityOID;
	}

	@JsonProperty("EntityOID")
	public void setEntityOID(String entityOID) {
		this.entityOID = entityOID;
	}

	public BaseReference withEntityOID(String entityOID) {
		this.entityOID = entityOID;
		return this;
	}

	@JsonProperty("WMEntityVersionID")
	public String getWMEntityVersionID() {
		return wMEntityVersionID;
	}

	@JsonProperty("WMEntityVersionID")
	public void setWMEntityVersionID(String wMEntityVersionID) {
		this.wMEntityVersionID = wMEntityVersionID;
	}

	public BaseReference withWMEntityVersionID(String wMEntityVersionID) {
		this.wMEntityVersionID = wMEntityVersionID;
		return this;
	}

	@JsonProperty("WMpartition")
	public String getWMpartition() {
		return wMpartition;
	}

	@JsonProperty("WMpartition")
	public void setWMpartition(String wMpartition) {
		this.wMpartition = wMpartition;
	}

	public BaseReference withWMpartition(String wMpartition) {
		this.wMpartition = wMpartition;
		return this;
	}

	@JsonProperty("RootID")
	public String getRootID() {
		return rootID;
	}

	@JsonProperty("RootID")
	public void setRootID(String rootID) {
		this.rootID = rootID;
	}

	public BaseReference withRootID(String rootID) {
		this.rootID = rootID;
		return this;
	}

	@JsonProperty("parentEntityID")
	public String getParentEntityID() {
		return parentEntityID;
	}

	@JsonProperty("parentEntityID")
	public void setParentEntityID(String parentEntityID) {
		this.parentEntityID = parentEntityID;
	}

	public BaseReference withParentEntityID(String parentEntityID) {
		this.parentEntityID = parentEntityID;
		return this;
	}

	@JsonProperty("EntityType")
	public String getEntityType() {
		return entityType;
	}

	@JsonProperty("EntityType")
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public BaseReference withEntityType(String entityType) {
		this.entityType = entityType;
		return this;
	}

	@JsonProperty("EntityStatus")
	public String getEntityStatus() {
		return entityStatus;
	}

	@JsonProperty("EntityStatus")
	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}

	public BaseReference withEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
		return this;
	}

	@JsonProperty("WMEntitySchemaName")
	public String getWMEntitySchemaName() {
		return wMEntitySchemaName;
	}

	@JsonProperty("WMEntitySchemaName")
	public void setWMEntitySchemaName(String wMEntitySchemaName) {
		this.wMEntitySchemaName = wMEntitySchemaName;
	}

	public BaseReference withWMEntitySchemaName(String wMEntitySchemaName) {
		this.wMEntitySchemaName = wMEntitySchemaName;
		return this;
	}

	@JsonProperty("WMEntitySchemaVersion")
	public String getWMEntitySchemaVersion() {
		return wMEntitySchemaVersion;
	}

	@JsonProperty("WMEntitySchemaVersion")
	public void setWMEntitySchemaVersion(String wMEntitySchemaVersion) {
		this.wMEntitySchemaVersion = wMEntitySchemaVersion;
	}

	public BaseReference withWMEntitySchemaVersion(String wMEntitySchemaVersion) {
		this.wMEntitySchemaVersion = wMEntitySchemaVersion;
		return this;
	}

	@JsonProperty("WMEntitySchemaCode")
	public String getWMEntitySchemaCode() {
		return wMEntitySchemaCode;
	}

	@JsonProperty("WMEntitySchemaCode")
	public void setWMEntitySchemaCode(String wMEntitySchemaCode) {
		this.wMEntitySchemaCode = wMEntitySchemaCode;
	}

	public BaseReference withWMEntitySchemaCode(String wMEntitySchemaCode) {
		this.wMEntitySchemaCode = wMEntitySchemaCode;
		return this;
	}

}

class Instrument {

	@JsonProperty("Symbol")
	private String symbol;
	@JsonProperty("SecurityID")
	private String securityID;
	@JsonProperty("SecurityType")
	private String securityType;

	@JsonProperty("Symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("Symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Instrument withSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	@JsonProperty("SecurityID")
	public String getSecurityID() {
		return securityID;
	}

	@JsonProperty("SecurityID")
	public void setSecurityID(String securityID) {
		this.securityID = securityID;
	}

	public Instrument withSecurityID(String securityID) {
		this.securityID = securityID;
		return this;
	}

	@JsonProperty("SecurityType")
	public String getSecurityType() {
		return securityType;
	}

	@JsonProperty("SecurityType")
	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}

	public Instrument withSecurityType(String securityType) {
		this.securityType = securityType;
		return this;
	}

}

class OrderQtyData {

	@JsonProperty("OrderQty")
	private String orderQty;

	@JsonProperty("OrderQty")
	public String getOrderQty() {
		return orderQty;
	}

	@JsonProperty("OrderQty")
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}

	public OrderQtyData withOrderQty(String orderQty) {
		this.orderQty = orderQty;
		return this;
	}

}

class Party {

	@JsonProperty("PartyID")
	private String partyID;
	@JsonProperty("PartyIDSource")
	private String partyIDSource;
	@JsonProperty("PartyRole")
	private String partyRole;

	@JsonProperty("PartyID")
	public String getPartyID() {
		return partyID;
	}

	@JsonProperty("PartyID")
	public void setPartyID(String partyID) {
		this.partyID = partyID;
	}

	public Party withPartyID(String partyID) {
		this.partyID = partyID;
		return this;
	}

	@JsonProperty("PartyIDSource")
	public String getPartyIDSource() {
		return partyIDSource;
	}

	@JsonProperty("PartyIDSource")
	public void setPartyIDSource(String partyIDSource) {
		this.partyIDSource = partyIDSource;
	}

	public Party withPartyIDSource(String partyIDSource) {
		this.partyIDSource = partyIDSource;
		return this;
	}

	@JsonProperty("PartyRole")
	public String getPartyRole() {
		return partyRole;
	}

	@JsonProperty("PartyRole")
	public void setPartyRole(String partyRole) {
		this.partyRole = partyRole;
	}

	public Party withPartyRole(String partyRole) {
		this.partyRole = partyRole;
		return this;
	}

}

class TrdRegTimestamp {

	@JsonProperty("TrdRegTimestamp")
	private String trdRegTimestamp;
	@JsonProperty("TrdRegTimestampType")
	private String trdRegTimestampType;
	@JsonProperty("TrdRegTimestampOrigin")
	private String trdRegTimestampOrigin;

	@JsonProperty("TrdRegTimestamp")
	public String getTrdRegTimestamp() {
		return trdRegTimestamp;
	}

	@JsonProperty("TrdRegTimestamp")
	public void setTrdRegTimestamp(String trdRegTimestamp) {
		this.trdRegTimestamp = trdRegTimestamp;
	}

	public TrdRegTimestamp withTrdRegTimestamp(String trdRegTimestamp) {
		this.trdRegTimestamp = trdRegTimestamp;
		return this;
	}

	@JsonProperty("TrdRegTimestampType")
	public String getTrdRegTimestampType() {
		return trdRegTimestampType;
	}

	@JsonProperty("TrdRegTimestampType")
	public void setTrdRegTimestampType(String trdRegTimestampType) {
		this.trdRegTimestampType = trdRegTimestampType;
	}

	public TrdRegTimestamp withTrdRegTimestampType(String trdRegTimestampType) {
		this.trdRegTimestampType = trdRegTimestampType;
		return this;
	}

	@JsonProperty("TrdRegTimestampOrigin")
	public String getTrdRegTimestampOrigin() {
		return trdRegTimestampOrigin;
	}

	@JsonProperty("TrdRegTimestampOrigin")
	public void setTrdRegTimestampOrigin(String trdRegTimestampOrigin) {
		this.trdRegTimestampOrigin = trdRegTimestampOrigin;
	}

	public TrdRegTimestamp withTrdRegTimestampOrigin(String trdRegTimestampOrigin) {
		this.trdRegTimestampOrigin = trdRegTimestampOrigin;
		return this;
	}

}

class WMEntityExtRefID {

	@JsonProperty("WMEntityExtRefID")
	private String wMEntityExtRefID;

	@JsonProperty("WMEntityExtRefID")
	public String getWMEntityExtRefID() {
		return wMEntityExtRefID;
	}

	@JsonProperty("WMEntityExtRefID")
	public void setWMEntityExtRefID(String wMEntityExtRefID) {
		this.wMEntityExtRefID = wMEntityExtRefID;
	}

	public WMEntityExtRefID withWMEntityExtRefID(String wMEntityExtRefID) {
		this.wMEntityExtRefID = wMEntityExtRefID;
		return this;
	}
}

class WMHeader {

	@JsonProperty("WMHeaderProduct")
	private String wMHeaderProduct;
	@JsonProperty("WMHeaderChannel")
	private String wMHeaderChannel;
	@JsonProperty("WMHeaderTouchpoint")
	private String wMHeaderTouchpoint;

	@JsonProperty("WMHeaderProduct")
	public String getWMHeaderProduct() {
		return wMHeaderProduct;
	}

	@JsonProperty("WMHeaderProduct")
	public void setWMHeaderProduct(String wMHeaderProduct) {
		this.wMHeaderProduct = wMHeaderProduct;
	}

	public WMHeader withWMHeaderProduct(String wMHeaderProduct) {
		this.wMHeaderProduct = wMHeaderProduct;
		return this;
	}

	@JsonProperty("WMHeaderChannel")
	public String getWMHeaderChannel() {
		return wMHeaderChannel;
	}

	@JsonProperty("WMHeaderChannel")
	public void setWMHeaderChannel(String wMHeaderChannel) {
		this.wMHeaderChannel = wMHeaderChannel;
	}

	public WMHeader withWMHeaderChannel(String wMHeaderChannel) {
		this.wMHeaderChannel = wMHeaderChannel;
		return this;
	}

	@JsonProperty("WMHeaderTouchpoint")
	public String getWMHeaderTouchpoint() {
		return wMHeaderTouchpoint;
	}

	@JsonProperty("WMHeaderTouchpoint")
	public void setWMHeaderTouchpoint(String wMHeaderTouchpoint) {
		this.wMHeaderTouchpoint = wMHeaderTouchpoint;
	}

	public WMHeader withWMHeaderTouchpoint(String wMHeaderTouchpoint) {
		this.wMHeaderTouchpoint = wMHeaderTouchpoint;
		return this;
	}

}
