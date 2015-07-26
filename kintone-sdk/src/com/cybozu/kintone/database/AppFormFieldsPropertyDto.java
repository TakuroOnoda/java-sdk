package com.cybozu.kintone.database;

import java.util.LinkedHashMap;
import java.util.List;

public class AppFormFieldsPropertyDto {
    public class Entity {
        private String code;
        private String type;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public class Lookup {
        private List<FieldMapping> fieldMappings;
        private String filterCond;
        private List<String> lookupPickerFields;
        private RelatedApp relatedApp;
        private String relatedKeyField;
        private String sort;

        public List<FieldMapping> getFieldMappings() {
            return fieldMappings;
        }

        public void setFieldMappings(List<FieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
        }

        public String getFilterCond() {
            return filterCond;
        }

        public void setFilterCond(String filterCond) {
            this.filterCond = filterCond;
        }

        public List<String> getLookupPickerFields() {
            return lookupPickerFields;
        }

        public void setLookupPickerFields(List<String> lookupPickerFields) {
            this.lookupPickerFields = lookupPickerFields;
        }

        public RelatedApp getRelatedApp() {
            return relatedApp;
        }

        public void setRelatedApp(RelatedApp relatedApp) {
            this.relatedApp = relatedApp;
        }

        public String getRelatedKeyField() {
            return relatedKeyField;
        }

        public void setRelatedKeyField(String relatedKeyField) {
            this.relatedKeyField = relatedKeyField;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }
    }

    public class FieldMapping {
        private String field;
        private String relatedField;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getRelatedField() {
            return relatedField;
        }

        public void setRelatedField(String relatedField) {
            this.relatedField = relatedField;
        }
    }

    public class RelatedApp {
        private String app;
        private String code;

        public String getApp() {
            return app;
        }

        public void setApp(String app) {
            this.app = app;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public class Options {
        private String index;
        private String label;

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }

    public class ReferenceTable {
        private Condition condition;
        private List<String> displayFields;
        private String filterCond;
        private RelatedApp relatedApp;
        private String size;
        private String sort;

        public Condition getCondition() {
            return condition;
        }

        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        public List<String> getDisplayFields() {
            return displayFields;
        }

        public void setDisplayFields(List<String> displayFields) {
            this.displayFields = displayFields;
        }

        public String getFilterCond() {
            return filterCond;
        }

        public void setFilterCond(String filterCond) {
            this.filterCond = filterCond;
        }

        public RelatedApp getRelatedApp() {
            return relatedApp;
        }

        public void setRelatedApp(RelatedApp relatedApp) {
            this.relatedApp = relatedApp;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }
    }

    public class Condition {
        private String field;
        private String relatedField;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getRelatedField() {
            return relatedField;
        }

        public void setRelatedField(String relatedField) {
            this.relatedField = relatedField;
        }
    }

    private String alige;
    private String code;
    private String defaultNowValue;
    private String defalutValue;
    private List<String> defalutValues;
    private String digit;
    private String displayScale;
    private String enabled;
    private List<Entity> entities;
    private String expression;
    private LinkedHashMap<String, AppFormFieldsPropertyDto> fields;
    private String format;
    private String hideExpression;
    private String label;
    private Lookup lookup;
    private String maxLength;
    private String maxValue;
    private String minLength;
    private String minValue;
    private Boolean noLabel;
    private String openGroup;
    private LinkedHashMap<String, Options> options;
    private String protocol;
    private ReferenceTable referenceTable;
    private Boolean required;
    private String thumbnailSize;
    private String type;
    private String unique;
    private String unit;
    private String unitPosition;
    private String revision;

    public String getAlige() {
        return alige;
    }

    public void setAlige(String alige) {
        this.alige = alige;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDefaultNowValue() {
        return defaultNowValue;
    }

    public void setDefaultNowValue(String defaultNowValue) {
        this.defaultNowValue = defaultNowValue;
    }

    public String getDefalutValue() {
        return defalutValue;
    }

    public void setDefalutValue(String defalutValue) {
        this.defalutValue = defalutValue;
    }

    public List<String> getDefalutValues() {
        return defalutValues;
    }

    public void setDefalutValues(List<String> defalutValues) {
        this.defalutValues = defalutValues;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }

    public String getDisplayScale() {
        return displayScale;
    }

    public void setDisplayScale(String displayScale) {
        this.displayScale = displayScale;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public LinkedHashMap<String, AppFormFieldsPropertyDto> getFields() {
        return fields;
    }

    public void setFields(LinkedHashMap<String, AppFormFieldsPropertyDto> fields) {
        this.fields = fields;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getHideExpression() {
        return hideExpression;
    }

    public void setHideExpression(String hideExpression) {
        this.hideExpression = hideExpression;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Lookup getLookup() {
        return lookup;
    }

    public void setLookup(Lookup lookup) {
        this.lookup = lookup;
    }

    public String getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(String maxLength) {
        this.maxLength = maxLength;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getMinLength() {
        return minLength;
    }

    public void setMinLength(String minLength) {
        this.minLength = minLength;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public Boolean isNoLabel() {
        return noLabel;
    }

    public void setNoLabel(Boolean noLabel) {
        this.noLabel = noLabel;
    }

    public String getOpenGroup() {
        return openGroup;
    }

    public void setOpenGroup(String openGroup) {
        this.openGroup = openGroup;
    }

    public LinkedHashMap<String, Options> getOptions() {
        return options;
    }

    public void setOptions(LinkedHashMap<String, Options> options) {
        this.options = options;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ReferenceTable getReferenceTable() {
        return referenceTable;
    }

    public void setReferenceTable(ReferenceTable referenceTable) {
        this.referenceTable = referenceTable;
    }

    public Boolean isRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getThumbnailSize() {
        return thumbnailSize;
    }

    public void setThumbnailSize(String thumbnailSize) {
        this.thumbnailSize = thumbnailSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitPosition() {
        return unitPosition;
    }

    public void setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }
}
