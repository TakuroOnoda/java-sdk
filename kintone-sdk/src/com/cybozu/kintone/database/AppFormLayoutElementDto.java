package com.cybozu.kintone.database;

import java.util.List;

public class AppFormLayoutElementDto {
    public class Field {
        private String code;
        private String elementId;
        private String label;
        private Size size;
        private String type;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getElementId() {
            return elementId;
        }

        public void setElementId(String elementId) {
            this.elementId = elementId;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Size getSize() {
            return size;
        }

        public void setSize(Size size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public class Size {
        private Long height;
        private Long innerHeight;
        private Long width;

        public Long getHeight() {
            return height;
        }

        public void setHeight(Long height) {
            this.height = height;
        }

        public Long getInnerHeight() {
            return innerHeight;
        }

        public void setInnerHeight(Long innerHeight) {
            this.innerHeight = innerHeight;
        }

        public Long getWidth() {
            return width;
        }

        public void setWidth(Long width) {
            this.width = width;
        }
    }

    private String code;
    private List<Field> fields;
    private List<AppFormLayoutElementDto> layout;
    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<AppFormLayoutElementDto> getLayout() {
        return layout;
    }

    public void setLayout(List<AppFormLayoutElementDto> layout) {
        this.layout = layout;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
