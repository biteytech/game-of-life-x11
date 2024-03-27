// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     long flags;
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 *     int min_width;
 *     int min_height;
 *     int max_width;
 *     int max_height;
 *     int width_inc;
 *     int height_inc;
 *     struct {
 *         int x;
 *         int y;
 *     } min_aspect, max_aspect;
 *     int base_width;
 *     int base_height;
 *     int win_gravity;
 * }
 * }
 */
public class XSizeHints {

    XSizeHints() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Xlib_h.C_LONG.withName("flags"),
        Xlib_h.C_INT.withName("x"),
        Xlib_h.C_INT.withName("y"),
        Xlib_h.C_INT.withName("width"),
        Xlib_h.C_INT.withName("height"),
        Xlib_h.C_INT.withName("min_width"),
        Xlib_h.C_INT.withName("min_height"),
        Xlib_h.C_INT.withName("max_width"),
        Xlib_h.C_INT.withName("max_height"),
        Xlib_h.C_INT.withName("width_inc"),
        Xlib_h.C_INT.withName("height_inc"),
        XSizeHints.min_aspect.layout().withName("min_aspect"),
        XSizeHints.min_aspect.layout().withName("max_aspect"),
        Xlib_h.C_INT.withName("base_width"),
        Xlib_h.C_INT.withName("base_height"),
        Xlib_h.C_INT.withName("win_gravity"),
        MemoryLayout.paddingLayout(4)
    ).withName("$anon$81:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong flags$LAYOUT = (OfLong)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long flags
     * }
     */
    public static final OfLong flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long flags
     * }
     */
    public static long flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long flags
     * }
     */
    public static void flags(MemorySegment struct, long fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfInt min_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int min_width
     * }
     */
    public static final OfInt min_width$layout() {
        return min_width$LAYOUT;
    }

    private static final long min_width$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int min_width
     * }
     */
    public static final long min_width$offset() {
        return min_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int min_width
     * }
     */
    public static int min_width(MemorySegment struct) {
        return struct.get(min_width$LAYOUT, min_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int min_width
     * }
     */
    public static void min_width(MemorySegment struct, int fieldValue) {
        struct.set(min_width$LAYOUT, min_width$OFFSET, fieldValue);
    }

    private static final OfInt min_height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min_height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int min_height
     * }
     */
    public static final OfInt min_height$layout() {
        return min_height$LAYOUT;
    }

    private static final long min_height$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int min_height
     * }
     */
    public static final long min_height$offset() {
        return min_height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int min_height
     * }
     */
    public static int min_height(MemorySegment struct) {
        return struct.get(min_height$LAYOUT, min_height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int min_height
     * }
     */
    public static void min_height(MemorySegment struct, int fieldValue) {
        struct.set(min_height$LAYOUT, min_height$OFFSET, fieldValue);
    }

    private static final OfInt max_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("max_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int max_width
     * }
     */
    public static final OfInt max_width$layout() {
        return max_width$LAYOUT;
    }

    private static final long max_width$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int max_width
     * }
     */
    public static final long max_width$offset() {
        return max_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int max_width
     * }
     */
    public static int max_width(MemorySegment struct) {
        return struct.get(max_width$LAYOUT, max_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int max_width
     * }
     */
    public static void max_width(MemorySegment struct, int fieldValue) {
        struct.set(max_width$LAYOUT, max_width$OFFSET, fieldValue);
    }

    private static final OfInt max_height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("max_height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int max_height
     * }
     */
    public static final OfInt max_height$layout() {
        return max_height$LAYOUT;
    }

    private static final long max_height$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int max_height
     * }
     */
    public static final long max_height$offset() {
        return max_height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int max_height
     * }
     */
    public static int max_height(MemorySegment struct) {
        return struct.get(max_height$LAYOUT, max_height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int max_height
     * }
     */
    public static void max_height(MemorySegment struct, int fieldValue) {
        struct.set(max_height$LAYOUT, max_height$OFFSET, fieldValue);
    }

    private static final OfInt width_inc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width_inc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int width_inc
     * }
     */
    public static final OfInt width_inc$layout() {
        return width_inc$LAYOUT;
    }

    private static final long width_inc$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int width_inc
     * }
     */
    public static final long width_inc$offset() {
        return width_inc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int width_inc
     * }
     */
    public static int width_inc(MemorySegment struct) {
        return struct.get(width_inc$LAYOUT, width_inc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int width_inc
     * }
     */
    public static void width_inc(MemorySegment struct, int fieldValue) {
        struct.set(width_inc$LAYOUT, width_inc$OFFSET, fieldValue);
    }

    private static final OfInt height_inc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height_inc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int height_inc
     * }
     */
    public static final OfInt height_inc$layout() {
        return height_inc$LAYOUT;
    }

    private static final long height_inc$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int height_inc
     * }
     */
    public static final long height_inc$offset() {
        return height_inc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int height_inc
     * }
     */
    public static int height_inc(MemorySegment struct) {
        return struct.get(height_inc$LAYOUT, height_inc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int height_inc
     * }
     */
    public static void height_inc(MemorySegment struct, int fieldValue) {
        struct.set(height_inc$LAYOUT, height_inc$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * }
     * }
     */
    public static class min_aspect {

        min_aspect() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            Xlib_h.C_INT.withName("x"),
            Xlib_h.C_INT.withName("y")
        ).withName("$anon$88:2");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int x
         * }
         */
        public static final OfInt x$layout() {
            return x$LAYOUT;
        }

        private static final long x$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int x
         * }
         */
        public static final long x$offset() {
            return x$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int x
         * }
         */
        public static int x(MemorySegment struct) {
            return struct.get(x$LAYOUT, x$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int x
         * }
         */
        public static void x(MemorySegment struct, int fieldValue) {
            struct.set(x$LAYOUT, x$OFFSET, fieldValue);
        }

        private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int y
         * }
         */
        public static final OfInt y$layout() {
            return y$LAYOUT;
        }

        private static final long y$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int y
         * }
         */
        public static final long y$offset() {
            return y$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int y
         * }
         */
        public static int y(MemorySegment struct) {
            return struct.get(y$LAYOUT, y$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int y
         * }
         */
        public static void y(MemorySegment struct, int fieldValue) {
            struct.set(y$LAYOUT, y$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this struct
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout min_aspect$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("min_aspect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * } min_aspect
     * }
     */
    public static final GroupLayout min_aspect$layout() {
        return min_aspect$LAYOUT;
    }

    private static final long min_aspect$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * } min_aspect
     * }
     */
    public static final long min_aspect$offset() {
        return min_aspect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * } min_aspect
     * }
     */
    public static MemorySegment min_aspect(MemorySegment struct) {
        return struct.asSlice(min_aspect$OFFSET, min_aspect$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * } min_aspect
     * }
     */
    public static void min_aspect(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, min_aspect$OFFSET, min_aspect$LAYOUT.byteSize());
    }

    private static final GroupLayout max_aspect$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("max_aspect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * } max_aspect
     * }
     */
    public static final GroupLayout max_aspect$layout() {
        return max_aspect$LAYOUT;
    }

    private static final long max_aspect$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * } max_aspect
     * }
     */
    public static final long max_aspect$offset() {
        return max_aspect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * } max_aspect
     * }
     */
    public static MemorySegment max_aspect(MemorySegment struct) {
        return struct.asSlice(max_aspect$OFFSET, max_aspect$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     int x;
     *     int y;
     * } max_aspect
     * }
     */
    public static void max_aspect(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, max_aspect$OFFSET, max_aspect$LAYOUT.byteSize());
    }

    private static final OfInt base_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("base_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int base_width
     * }
     */
    public static final OfInt base_width$layout() {
        return base_width$LAYOUT;
    }

    private static final long base_width$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int base_width
     * }
     */
    public static final long base_width$offset() {
        return base_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int base_width
     * }
     */
    public static int base_width(MemorySegment struct) {
        return struct.get(base_width$LAYOUT, base_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int base_width
     * }
     */
    public static void base_width(MemorySegment struct, int fieldValue) {
        struct.set(base_width$LAYOUT, base_width$OFFSET, fieldValue);
    }

    private static final OfInt base_height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("base_height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int base_height
     * }
     */
    public static final OfInt base_height$layout() {
        return base_height$LAYOUT;
    }

    private static final long base_height$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int base_height
     * }
     */
    public static final long base_height$offset() {
        return base_height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int base_height
     * }
     */
    public static int base_height(MemorySegment struct) {
        return struct.get(base_height$LAYOUT, base_height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int base_height
     * }
     */
    public static void base_height(MemorySegment struct, int fieldValue) {
        struct.set(base_height$LAYOUT, base_height$OFFSET, fieldValue);
    }

    private static final OfInt win_gravity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("win_gravity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static final OfInt win_gravity$layout() {
        return win_gravity$LAYOUT;
    }

    private static final long win_gravity$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static final long win_gravity$offset() {
        return win_gravity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static int win_gravity(MemorySegment struct) {
        return struct.get(win_gravity$LAYOUT, win_gravity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static void win_gravity(MemorySegment struct, int fieldValue) {
        struct.set(win_gravity$LAYOUT, win_gravity$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

